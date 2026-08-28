import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Consumer;

public record cyd(cwy<cye> c, boolean d) implements day {
   public static final Codec<cyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cwy.a(me.L, cye.c).fieldOf("song").forGetter(cyd::a), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cyd::b))
            .apply($$0, cyd::new)
   );
   public static final yt<wg, cyd> b = yt.a(cwy.a(me.L, cye.d), cyd::a, yr.b, cyd::b, cyd::new);

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      ju.a $$3 = $$0.a();
      if (this.d && $$3 != null) {
         this.c.a($$3).ifPresent($$1x -> {
            xj $$2x = ((cye)$$1x.a()).c().f();
            wy.a($$2x, xs.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public cyd a(boolean $$0) {
      return new cyd(this.c, $$0);
   }

   public static btq a(dhp $$0, jj $$1, cxy $$2, cqi $$3) {
      cyd $$4 = $$2.a(kx.ad);
      if ($$4 == null) {
         return btq.f;
      } else {
         dym $$5 = $$0.a_($$1);
         if ($$5.a(dkw.eg) && !$$5.c(dpa.b)) {
            if (!$$0.C) {
               cxy $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dwq $$7) {
                  $$7.b($$6);
                  $$0.a(edm.c, $$1, edm.a.a($$3, $$5));
               }

               $$3.a(awu.al);
            }

            return btq.a;
         } else {
            return btq.f;
         }
      }
   }

   public cwy<cye> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
