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

public class adj {
   private static final za<ByteBuf, Map<ehf.a, long[]>> a = yy.a($$0 -> new EnumMap<>(ehf.a.class), ehf.a.h, yy.o);
   private static final int b = 2097152;
   private final Map<ehf.a, long[]> c;
   private final byte[] d;
   private final List<adj.a> e;

   public adj(edn $$0) {
      this.c = $$0.e()
         .stream()
         .filter($$0x -> ((ehf.a)$$0x.getKey()).b())
         .collect(Collectors.toMap(Entry::getKey, $$0x -> (long[])((ehf)$$0x.getValue()).a().clone()));
      this.d = new byte[a($$0)];
      a(new vy(this.c()), $$0);
      this.e = Lists.newArrayList();

      for (Entry<iw, dye> $$1 : $$0.I().entrySet()) {
         this.e.add(adj.a.a($$1.getValue()));
      }
   }

   public adj(wn $$0, int $$1, int $$2) {
      this.c = a.decode($$0);
      int $$3 = $$0.l();
      if ($$3 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.d = new byte[$$3];
         $$0.b(this.d);
         this.e = adj.a.b.decode($$0);
      }
   }

   public void a(wn $$0) {
      a.encode($$0, this.c);
      $$0.c(this.d.length);
      $$0.c(this.d);
      adj.a.b.encode($$0, this.e);
   }

   private static int a(edn $$0) {
      int $$1 = 0;

      for (edo $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.d);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vy $$0, edn $$1) {
      for (edo $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<adj.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(adj.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      iw.a $$5 = new iw.a();

      for (adj.a $$6 : this.e) {
         int $$7 = $$3 + jz.b($$6.c >> 4);
         int $$8 = $$4 + jz.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vy a() {
      return new vy(Unpooled.wrappedBuffer(this.d));
   }

   public Map<ehf.a, long[]> b() {
      return this.c;
   }

   static class a {
      public static final za<wn, adj.a> a = za.a(adj.a::a, adj.a::new);
      public static final za<wn, List<adj.a>> b = a.a(yy.a());
      final int c;
      final int d;
      final dyg<?> e;
      @Nullable
      final ua f;

      private a(int $$0, int $$1, dyg<?> $$2, @Nullable ua $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wn $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yy.a(mi.e).decode($$0);
         this.f = $$0.o();
      }

      private void a(wn $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         yy.a(mi.e).encode($$0, this.e);
         $$0.a(this.f);
      }

      static adj.a a(dye $$0) {
         ua $$1 = $$0.a($$0.i().J_());
         iw $$2 = $$0.aB_();
         int $$3 = jz.b($$2.u()) << 4 | jz.b($$2.w());
         return new adj.a($$3, $$2.v(), $$0.p(), $$1.j() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(iw var1, dyg<?> var2, @Nullable ua var3);
   }
}
