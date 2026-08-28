import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class adq {
   private static final ze<ByteBuf, Map<ehp.a, long[]>> a = zc.a($$0 -> new EnumMap<>(ehp.a.class), ehp.a.h, zc.o);
   private static final int b = 2097152;
   private final Map<ehp.a, long[]> c;
   private final byte[] d;
   private final List<adq.a> e;

   public adq(edx $$0) {
      this.c = $$0.e()
         .stream()
         .filter($$0x -> ((ehp.a)$$0x.getKey()).b())
         .collect(Collectors.toMap(Entry::getKey, $$0x -> (long[])((ehp)$$0x.getValue()).a().clone()));
      this.d = new byte[a($$0)];
      a(new vy(this.c()), $$0);
      this.e = Lists.newArrayList();

      for (Entry<iw, dyo> $$1 : $$0.I().entrySet()) {
         this.e.add(adq.a.a($$1.getValue()));
      }
   }

   public adq(wp $$0, int $$1, int $$2) {
      this.c = a.decode($$0);
      int $$3 = $$0.l();
      if ($$3 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.d = new byte[$$3];
         $$0.b(this.d);
         this.e = adq.a.b.decode($$0);
      }
   }

   public void a(wp $$0) {
      a.encode($$0, this.c);
      $$0.c(this.d.length);
      $$0.c(this.d);
      adq.a.b.encode($$0, this.e);
   }

   private static int a(edx $$0) {
      int $$1 = 0;

      for (edy $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.d);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vy $$0, edx $$1) {
      for (edy $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adq.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adq.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iw.a $$5 = new iw.a();

      for (adq.a $$6 : this.e) {
         int $$7 = $$3 + jz.b($$6.c >> 4);
         int $$8 = $$4 + jz.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vy a() {
      return new vy(Unpooled.wrappedBuffer(this.d));
   }

   public Map<ehp.a, long[]> b() {
      return this.c;
   }

   static class a {
      public static final ze<wp, adq.a> a = ze.a(adq.a::a, adq.a::new);
      public static final ze<wp, List<adq.a>> b = a.a(zc.a());
      final int c;
      final int d;
      final dyq<?> e;
      @Nullable
      final ua f;

      private a(int $$0, int $$1, dyq<?> $$2, @Nullable ua $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wp $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zc.a(mi.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wp $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         zc.a(mi.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adq.a a(dyo $$0) {
         ua $$1 = $$0.a($$0.i().J_());
         iw $$2 = $$0.aC_();
         int $$3 = jz.b($$2.u()) << 4 | jz.b($$2.w());
         return new adq.a($$3, $$2.v(), $$0.p(), $$1.j() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iw var1, dyq<?> var2, @Nullable ua var3);
   }
}
