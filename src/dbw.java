import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dbw extends daa {
   public static final MapCodec<dbw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.fieldOf("wood_type").forGetter(daa::d), t()).apply($$0, dbw::new));
   public static final dfx b = cww.aE;
   public static final eia c = ctc.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eia d = ctc.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eia e = ehx.a(c, ctc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eia i = ehx.a(d, ctc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ha, eia> j = Maps.newEnumMap(ImmutableMap.of(ha.c, e, ha.d, e, ha.f, i, ha.e, i));

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(dgq $$0, dfc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ha.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.c_($$2) instanceof deh $$6) {
         cjl $$7 = $$3.b($$4);
         if (this.a($$0, $$3, $$5, $$6, $$7)) {
            return bhe.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dfd $$0, cca $$1, ehd $$2, deh $$3, cjl $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cix && !this.a($$2, $$0);
   }

   private boolean a(ehd $$0, dfd $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return j.get($$0.c(b));
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehm.a());
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      switch ((ha)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = $$0.c(b).h();
      ha $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cqe $$0, dfd $$1, gw $$2, ha $$3) {
      dfd $$4 = $$0.a_($$2);
      return $$4.a(apv.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dbb.a);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o();
      eag $$2 = $$0.q().b_($$0.a());
      cqe $$3 = $$0.q();
      gw $$4 = $$0.a();

      for (ha $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eah.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfd $$0) {
      return $$0.c(b).p();
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddv($$0, $$1);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.i, deh::a);
   }
}
