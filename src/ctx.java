import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public record ctx(ctx.a d, IntList e, IntList f, boolean g, boolean h) implements cuj {
   public static final ctx a = new ctx(ctx.a.a, IntList.of(), IntList.of(), false, false);
   private static final Codec<IntList> i = Codec.INT.listOf().xmap(IntArrayList::new, ArrayList::new);
   public static final Codec<ctx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ctx.a.g.fieldOf("shape").forGetter(ctx::a),
               aws.a(i, "colors", IntList.of()).forGetter(ctx::b),
               aws.a(i, "fade_colors", IntList.of()).forGetter(ctx::c),
               aws.a(Codec.BOOL, "has_trail", false).forGetter(ctx::d),
               aws.a(Codec.BOOL, "has_twinkle", false).forGetter(ctx::e)
            )
            .apply($$0, ctx::new)
   );
   private static final ye<ByteBuf, IntList> j = yc.e.a(yc.a()).a(IntArrayList::new, ArrayList::new);
   public static final ye<ByteBuf, ctx> c = ye.a(ctx.a.f, ctx::a, j, ctx::b, j, ctx::c, yc.b, ctx::d, yc.b, ctx::e, ctx::new);
   private static final wg k = wg.c("item.minecraft.firework_star.custom_color");

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      this.a($$0);
      this.b($$0);
   }

   public void a(Consumer<wg> $$0) {
      $$0.accept(this.d.a().a(n.h));
   }

   public void b(Consumer<wg> $$0) {
      if (!this.e.isEmpty()) {
         $$0.accept(a(wg.i().a(n.h), this.e));
      }

      if (!this.f.isEmpty()) {
         $$0.accept(a(wg.c("item.minecraft.firework_star.fade_to").b(wf.v).a(n.h), this.f));
      }

      if (this.g) {
         $$0.accept(wg.c("item.minecraft.firework_star.trail").a(n.h));
      }

      if (this.h) {
         $$0.accept(wg.c("item.minecraft.firework_star.flicker").a(n.h));
      }
   }

   private static wg a(wu $$0, IntList $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         if ($$2 > 0) {
            $$0.f(", ");
         }

         $$0.b(a($$1.getInt($$2)));
      }

      return $$0;
   }

   private static wg a(int $$0) {
      cqc $$1 = cqc.b($$0);
      return (wg)($$1 == null ? k : wg.c("item.minecraft.firework_star." + $$1.b()));
   }

   public ctx a(IntList $$0) {
      return new ctx(this.d, this.e, new IntArrayList($$0), this.g, this.h);
   }

   public ctx.a a() {
      return this.d;
   }

   public IntList b() {
      return this.e;
   }

   public IntList c() {
      return this.f;
   }

   public boolean d() {
      return this.g;
   }

   public boolean e() {
      return this.h;
   }

   public static enum a implements aye {
      a(0, "small_ball"),
      b(1, "large_ball"),
      c(2, "star"),
      d(3, "creeper"),
      e(4, "burst");

      private static final IntFunction<ctx.a> h = awb.a(ctx.a::b, values(), awb.a.a);
      public static final ye<ByteBuf, ctx.a> f = yc.a(h, ctx.a::b);
      public static final Codec<ctx.a> g = aye.b(ctx.a::values);
      private final int i;
      private final String j;

      private a(int $$0, String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public wu a() {
         return wg.c("item.minecraft.firework_star.shape." + this.j);
      }

      public int b() {
         return this.i;
      }

      public static ctx.a a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
