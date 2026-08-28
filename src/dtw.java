import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtw extends dme implements dlx {
   public static final MapCodec<dtw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ald.a(mg.i).fieldOf("fruit").forGetter($$0x -> $$0x.e),
               ald.a(mg.i).fieldOf("attached_stem").forGetter($$0x -> $$0x.f),
               ald.a(mg.K).fieldOf("seed").forGetter($$0x -> $$0x.g),
               t()
            )
            .apply($$0, dtw::new)
   );
   public static final int b = 7;
   public static final eao c = eae.ay;
   private static final feq[] d = dlu.a(7, $$0 -> dlu.b(2.0, 0.0, (double)(2 + $$0 * 2)));
   private final ald<dlu> e;
   private final ald<dlu> f;
   private final ald<cyo> g;

   @Override
   public MapCodec<dtw> a() {
      return a;
   }

   protected dtw(ald<dlu> $$0, ald<dlu> $$1, ald<cyo> $$2, dzn.d $$3) {
      super($$3);
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.cK);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if ($$1.b($$2, 0) >= 9) {
         float $$4 = dnq.a(this, $$1, $$2);
         if ($$3.a((int)(25.0F / $$4) + 1) == 0) {
            int $$5 = $$0.c(c);
            if ($$5 < 7) {
               $$0 = $$0.b(c, Integer.valueOf($$5 + 1));
               $$1.a($$2, $$0, 2);
            } else {
               ja $$6 = ja.c.a.a($$3);
               iu $$7 = $$2.a($$6);
               dzo $$8 = $$1.a_($$7.e());
               if ($$1.a_($$7).l() && ($$8.a(dlw.cK) || $$8.a(axa.ah))) {
                  jr<dlu> $$9 = $$1.F_().f(mg.i);
                  Optional<dlu> $$10 = $$9.f(this.e);
                  Optional<dlu> $$11 = $$9.f(this.f);
                  if ($$10.isPresent() && $$11.isPresent()) {
                     $$1.b($$7, $$10.get().m());
                     $$1.b($$2, $$11.get().m().b(dpt.e, $$6));
                  }
               }
            }
         }
      }
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys((dio)DataFixUtils.orElse($$0.F_().f(mg.K).f(this.g), this));
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$2.c(c) != 7;
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      int $$4 = Math.min(7, $$3.c(c) + azk.a($$0.A, 2, 5));
      dzo $$5 = $$3.b(c, Integer.valueOf($$4));
      $$0.a($$2, $$5, 2);
      if ($$4 == 7) {
         $$5.b($$0, $$2, $$0.A);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c);
   }
}
