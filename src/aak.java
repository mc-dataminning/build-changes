import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class aak {
   private static final int a = 2097152;
   private final so b;
   private final byte[] c;
   private final List<aak.a> d;

   public aak(dlw $$0) {
      this.b = new so();

      for (Entry<doy.a, doy> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new sv($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new uj(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<hx, dhd> $$2 : $$0.G().entrySet()) {
         this.d.add(aak.a.a($$2.getValue()));
      }
   }

   public aak(uj $$0, int $$1, int $$2) {
      this.b = $$0.q();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.n();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = $$0.a(aak.a::new);
         }
      }
   }

   public void a(uj $$0) {
      $$0.a((tl)this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
   }

   private static int a(dlw $$0) {
      int $$1 = 0;

      for (dlx $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(uj $$0, dlw $$1) {
      for (dlx $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<aak.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(aak.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      hx.a $$5 = new hx.a();

      for (aak.a $$6 : this.d) {
         int $$7 = $$3 + iz.b($$6.a >> 4);
         int $$8 = $$4 + iz.b($$6.a);
         $$5.d($$7, $$6.b, $$8);
         $$0.accept($$5, $$6.c, $$6.d);
      }
   }

   public uj a() {
      return new uj(Unpooled.wrappedBuffer(this.c));
   }

   public so b() {
      return this.b;
   }

   static class a {
      final int a;
      final int b;
      final dhf<?> c;
      @Nullable
      final so d;

      private a(int $$0, int $$1, dhf<?> $$2, @Nullable so $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      private a(uj $$0) {
         this.a = $$0.readByte();
         this.b = $$0.readShort();
         this.c = $$0.a(kd.k);
         this.d = $$0.q();
      }

      void a(uj $$0) {
         $$0.k(this.a);
         $$0.l(this.b);
         $$0.a(kd.k, this.c);
         $$0.a((tl)this.d);
      }

      static aak.a a(dhd $$0) {
         so $$1 = $$0.aA_();
         hx $$2 = $$0.aE_();
         int $$3 = iz.b($$2.u()) << 4 | iz.b($$2.w());
         return new aak.a($$3, $$2.v(), $$0.v(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(hx var1, dhf<?> var2, @Nullable so var3);
   }
}
