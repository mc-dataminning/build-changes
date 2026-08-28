import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnt extends dlu {
   public static final MapCodec<dnt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.fieldOf("wood_type").forGetter(dlu::d), u()).apply($$0, dnt::new));
   public static final dsr b = diq.aE;
   public static final ewf c = deu.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewf d = deu.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewf e = ewc.a(c, deu.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewf i = ewc.a(d, deu.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewf> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dtk $$0, drw.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dqm $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqr.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(drx $$0, cms $$1, evi $$2, dqm $$3, cuk $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctx && !this.a($$2, $$0);
   }

   private boolean a(evi $$0, drx $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evr.a());
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(drx $$0, dbw $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dbw $$0, drx $$1, iz $$2, je $$3) {
      drx $$4 = $$0.a_($$2);
      return $$4.a(awl.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dmv.a);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      enq $$2 = $$0.q().b_($$0.a());
      dbw $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drx $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpz($$0, $$1);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.i, dqm::a);
   }
}
