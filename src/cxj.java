import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record cxj(cxj.a e, IntList f, IntList g, boolean h, boolean i) implements cxx {
   public static final cxj a = new cxj(cxj.a.a, IntList.of(), IntList.of(), false, false);
   public static final Codec<IntList> b = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<cxj> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxj.a.g.fieldOf("shape").forGetter(cxj::a),
               axu.a(b, "colors", IntList.of()).forGetter(cxj::b),
               axu.a(b, "fade_colors", IntList.of()).forGetter(cxj::c),
               axu.a(Codec.BOOL, "has_trail", false).forGetter(cxj::d),
               axu.a(Codec.BOOL, "has_twinkle", false).forGetter(cxj::e)
            )
            .apply($$0, cxj::new)
   );
   private static final zc<ByteBuf, IntList> j = za.f.a(za.a()).a(IntArrayList::new, ArrayList::new);
   public static final zc<ByteBuf, cxj> d = zc.a(cxj.a.f, cxj::a, j, cxj::b, j, cxj::c, za.b, cxj::d, za.b, cxj::e, cxj::new);
   private static final xe k = xe.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      this.a($$0);
      this.b($$0);
   }

   public void a(Consumer<xe> $$0) {
      $$0.accept(this.e.a().a(n.h));
   }

   public void b(Consumer<xe> $$0) {
      if (!this.f.isEmpty()) {
         $$0.accept(a(xe.i().a(n.h), this.f));
      }

      if (!this.g.isEmpty()) {
         $$0.accept(a(xe.c("item.minecraft.firework_star.fade_to").a(xd.v).a(n.h), this.g));
      }

      if (this.h) {
         $$0.accept(xe.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.i) {
         $$0.accept(xe.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static xe a(xs $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.a(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static xe a(int $$0) {
      csy $$1 = csy.b($$0);
      return (xe)($$1 == null ? k : xe.c("item.minecraft.firework_star." + $$1.b()));
   }

   public cxj a(IntList $$0) {
      return new cxj(this.e, this.f, new IntArrayList($$0), this.h, this.i);
   }

   public cxj.a a() {
      return this.e;
   }

   public IntList b() {
      return this.f;
   }

   public IntList c() {
      return this.g;
   }

   public boolean d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public static enum a implements azg {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<cxj.a> h = axd.a(cxj.a::b, values(), axd.a.a);
      public static final zc<ByteBuf, cxj.a> f = za.a(h, cxj.a::b);
      public static final Codec<cxj.a> g = azg.b(cxj.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public xs a() {
         return xe.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static cxj.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
