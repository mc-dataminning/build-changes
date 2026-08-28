import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class edn implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<edm> c = new Long2ObjectLinkedOpenHashMap();
   private final edp d;
   private final Path e;
   private final boolean f;

   edn(edp $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private edm b(dic $$0) throws IOException {
      long $$1 = dic.c($$0.h(), $$0.i());
      edm $$2 = (edm)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((edm)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         edm $$4 = new edm(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public tz a(dic $$0) throws IOException {
      edm $$1 = this.b($$0);

      tz var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = um.a($$2);
      }

      return var4;
   }

   public void a(dic $$0, ut $$1) throws IOException {
      edm $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            um.a((DataInput)$$3, $$1, ui.a());
         }
      }
   }

   protected void a(dic $$0, @Nullable tz $$1) throws IOException {
      edm $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            um.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayt<IOException> $$0 = new ayt<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         edm $$1 = (edm)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         edm $$0 = (edm)var1.next();
         $$0.b();
      }
   }

   public edp b() {
      return this.d;
   }
}
