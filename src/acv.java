import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acv {
   private static final int a = 2097152;
   private final ty b;
   private final byte[] c;
   private final List<acv.a> d;

   public acv(dse $$0) {
      this.b = new ty();

      for (Entry<dvq.a, dvq> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uf($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vs(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<im, dnd> $$2 : $$0.G().entrySet()) {
         this.d.add(acv.a.a($$2.getValue()));
      }
   }

   public acv(wd $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = acv.a.b.decode($$0);
         }
      }
   }

   public void a(wd $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acv.a.b.encode($$0, this.d);
   }

   private static int a(dse $$0) {
      int $$1 = 0;

      for (dsf $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vs $$0, dse $$1) {
      for (dsf $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acv.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acv.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      im.a $$5 = new im.a();

      for (acv.a $$6 : this.d) {
         int $$7 = $$3 + jo.b($$6.c >> 4);
         int $$8 = $$4 + jo.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vs a() {
      return new vs(Unpooled.wrappedBuffer(this.c));
   }

   public ty b() {
      return this.b;
   }

   static class a {
      public static final yq<wd, acv.a> a = yq.a(acv.a::a, acv.a::new);
      public static final yq<wd, List<acv.a>> b = a.a(yo.a());
      final int c;
      final int d;
      final dnf<?> e;
      @Nullable
      final ty f;

      private a(int $$0, int $$1, dnf<?> $$2, @Nullable ty $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wd $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yo.a(ld.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wd $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yo.a(ld.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acv.a a(dnd $$0) {
         ty $$1 = $$0.a($$0.i().H_());
         im $$2 = $$0.az_();
         int $$3 = jo.b($$2.u()) << 4 | jo.b($$2.w());
         return new acv.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(im var1, dnf<?> var2, @Nullable ty var3);
   }
}
