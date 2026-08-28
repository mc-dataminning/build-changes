import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dpb extends doj {
   public static final MapCodec<dpb> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), u()).apply($$0, dpb::new));
   public static final dtw g = dju.aE;
   protected static final float h = 2.5F;
   private static final Map<ji, ext> i = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfy.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ji.d,
         dfy.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ji.e,
         dfy.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ji.f,
         dfy.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dpb> a() {
      return f;
   }

   protected dpb(lq $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return m($$0);
   }

   public static ext m(dtc $$0) {
      return i.get($$0.c(g));
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return b($$1, $$2, $$0.c(g));
   }

   public static boolean b(dcz $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2.g());
      dtc $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      dcz $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? dga.a.o() : $$0;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      ji $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ji $$10 = $$4.g();
      $$1.a(lm.ae, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(g);
   }
}
