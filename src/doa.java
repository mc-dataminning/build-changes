import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doa extends dmb {
   public static final MapCodec<doa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.fieldOf("wood_type").forGetter(dmb::d), u()).apply($$0, doa::new));
   public static final dsy b = dix.aE;
   public static final ewm c = dfb.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewm d = dfb.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewm e = ewj.a(c, dfb.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewm i = ewj.a(d, dfb.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewm> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dtr $$0, dsd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dqt $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dse $$0, cmz $$1, evp $$2, dqt $$3, cur $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cue && !this.a($$2, $$0);
   }

   private boolean a(evp $$0, dse $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evy.a());
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dse $$0, dcd $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcd $$0, dse $$1, iz $$2, je $$3) {
      dse $$4 = $$0.a_($$2);
      return $$4.a(awp.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dnc.a);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      dse $$1 = this.o();
      enx $$2 = $$0.q().b_($$0.a());
      dcd $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eny.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dse $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqg($$0, $$1);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.i, dqt::a);
   }
}
