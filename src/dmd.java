import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmd extends dke {
   public static final MapCodec<dmd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dru.a.fieldOf("wood_type").forGetter(dke::d), u()).apply($$0, dmd::new));
   public static final drb b = dha.aE;
   public static final eui c = dde.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eui d = dde.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eui e = euf.a(c, dde.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eui i = euf.a(d, dde.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<is, eui> j = Maps.newEnumMap(ImmutableMap.of(is.c, e, is.d, e, is.f, i, is.e, i));

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dru $$0, dqg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, is.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bpo a(csz $$0, dqh $$1, dad $$2, in $$3, clh $$4, bpl $$5, etl $$6) {
      if ($$2.c_($$3) instanceof dow $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bpo.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dqh $$0, clh $$1, etl $$2, dow $$3, csz $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.f() instanceof csm && !this.a($$2, $$0);
   }

   private boolean a(etl $$0, dqh $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return this.a($$0, $$1, $$2, etu.a());
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dqh $$0, dag $$1, in $$2) {
      is $$3 = $$0.c(b).h();
      is $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dag $$0, dqh $$1, in $$2, is $$3) {
      dqh $$4 = $$0.a_($$2);
      return $$4.a(avr.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dlf.a);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n();
      ema $$2 = $$0.q().b_($$0.a());
      dag $$3 = $$0.q();
      in $$4 = $$0.a();

      for (is $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            is $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == emb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dqh $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new doj($$0, $$1);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.i, dow::a);
   }
}
