import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dza implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dyz> c = new Long2ObjectLinkedOpenHashMap();
   private final dzc d;
   private final Path e;
   private final boolean f;

   dza(dzc $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dyz b(del $$0) throws IOException {
      long $$1 = del.c($$0.h(), $$0.i());
      dyz $$2 = (dyz)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dyz)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dyz $$4 = new dyz(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public un a(del $$0) throws IOException {
      dyz $$1 = this.b($$0);

      un var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = va.a($$2);
      }

      return var4;
   }

   public void a(del $$0, vh $$1) throws IOException {
      dyz $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            va.a((DataInput)$$3, $$1, uw.a());
         }
      }
   }

   protected void a(del $$0, @Nullable un $$1) throws IOException {
      dyz $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            va.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayv<IOException> $$0 = new ayv<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dyz $$1 = (dyz)var2.next();

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
         dyz $$0 = (dyz)var1.next();
         $$0.b();
      }
   }

   public dzc b() {
      return this.d;
   }
}
