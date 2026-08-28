import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class adc {
   private static final int a = 2097152;
   private final tw b;
   private final byte[] c;
   private final List<adc.a> d;

   public adc(eat $$0) {
      this.b = new tw();

      for (Entry<eel.a, eel> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ud($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vr(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jj, dvl> $$2 : $$0.I().entrySet()) {
         this.d.add(adc.a.a($$2.getValue()));
      }
   }

   public adc(wg $$0, int $$1, int $$2) {
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
            this.d = adc.a.b.decode($$0);
         }
      }
   }

   public void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      adc.a.b.encode($$0, this.d);
   }

   private static int a(eat $$0) {
      int $$1 = 0;

      for (eau $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vr $$0, eat $$1) {
      for (eau $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adc.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adc.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jj.a $$5 = new jj.a();

      for (adc.a $$6 : this.d) {
         int $$7 = $$3 + kl.b($$6.c >> 4);
         int $$8 = $$4 + kl.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vr a() {
      return new vr(Unpooled.wrappedBuffer(this.c));
   }

   public tw b() {
      return this.b;
   }

   static class a {
      public static final yt<wg, adc.a> a = yt.a(adc.a::a, adc.a::new);
      public static final yt<wg, List<adc.a>> b = a.a(yr.a());
      final int c;
      final int d;
      final dvn<?> e;
      @Nullable
      final tw f;

      private a(int $$0, int $$1, dvn<?> $$2, @Nullable tw $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wg $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yr.a(me.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wg $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yr.a(me.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adc.a a(dvl $$0) {
         tw $$1 = $$0.a($$0.i().F_());
         jj $$2 = $$0.aw_();
         int $$3 = kl.b($$2.u()) << 4 | kl.b($$2.w());
         return new adc.a($$3, $$2.v(), $$0.p(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jj var1, dvn<?> var2, @Nullable tw var3);
   }
}
