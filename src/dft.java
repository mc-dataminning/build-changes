import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dft extends dlu {
   public static final MapCodec<dft> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.fieldOf("wood_type").forGetter(dlu::d), u()).apply($$0, dft::new));
   public static final dsx b = dsn.ba;
   public static final dso c = dsn.a;
   protected static final float d = 5.0F;
   protected static final ewf e = deu.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewf> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         deu.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         deu.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         deu.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         deu.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(dtk $$0, drw.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if ($$2.c_($$3) instanceof dqm $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqr.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cms $$0, evi $$1, dqm $$2, cuk $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctx && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dmv.b);
   }

   @Override
   public drx a(cxv $$0) {
      dbt $$1 = $$0.q();
      enq $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      drx $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awl.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !deu.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dnt.b)) {
            je $$8 = $$4.c(dnt.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dtd.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtd.a($$6.g()) : dtd.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == enr.c));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      ewf $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewf b_(drx $$0, daz $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evr.a());
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drx $$0) {
      return dtd.b($$0.c(b));
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.i, dqm::a);
   }
}
