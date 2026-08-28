import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dzh implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dzg> c = new Long2ObjectLinkedOpenHashMap();
   private final dzj d;
   private final Path e;
   private final boolean f;

   dzh(dzj $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dzg b(des $$0) throws IOException {
      long $$1 = des.c($$0.h(), $$0.i());
      dzg $$2 = (dzg)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dzg)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dzg $$4 = new dzg(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ul a(des $$0) throws IOException {
      dzg $$1 = this.b($$0);

      ul var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = uy.a($$2);
      }

      return var4;
   }

   public void a(des $$0, vf $$1) throws IOException {
      dzg $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            uy.a((DataInput)$$3, $$1, uu.a());
         }
      }
   }

   protected void a(des $$0, @Nullable ul $$1) throws IOException {
      dzg $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            uy.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayu<IOException> $$0 = new ayu<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dzg $$1 = (dzg)var2.next();

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
         dzg $$0 = (dzg)var1.next();
         $$0.b();
      }
   }

   public dzj b() {
      return this.d;
   }
}
