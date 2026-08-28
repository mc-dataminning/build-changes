import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dny extends dlz {
   public static final MapCodec<dny> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtp.a.fieldOf("wood_type").forGetter(dlz::d), u()).apply($$0, dny::new));
   public static final dsw b = div.aE;
   public static final ewk c = dez.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewk d = dez.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewk e = ewh.a(c, dez.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewk i = ewh.a(d, dez.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewk> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dtp $$0, dsb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$2.c_($$3) instanceof dqr $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsc $$0, cmx $$1, evn $$2, dqr $$3, cup $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cuc && !this.a($$2, $$0);
   }

   private boolean a(evn $$0, dsc $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewk b_(dsc $$0, dbe $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evw.a());
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsc $$0, dcb $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcb $$0, dsc $$1, iz $$2, je $$3) {
      dsc $$4 = $$0.a_($$2);
      return $$4.a(awp.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dna.a);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = this.o();
      env $$2 = $$0.q().b_($$0.a());
      dcb $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsc $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqe($$0, $$1);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dph> dpi<T> a(dby $$0, dsc $$1, dpj<T> $$2) {
      return a($$2, dpj.i, dqr::a);
   }
}
