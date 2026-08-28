import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnz extends dma {
   public static final MapCodec<dnz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtq.a.fieldOf("wood_type").forGetter(dma::d), u()).apply($$0, dnz::new));
   public static final dsx b = diw.aE;
   public static final ewl c = dfa.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewl d = dfa.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewl e = ewi.a(c, dfa.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewl i = ewi.a(d, dfa.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewl> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dtq $$0, dsc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      if ($$2.c_($$3) instanceof dqs $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqx.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsd $$0, cmy $$1, evo $$2, dqs $$3, cuq $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cud && !this.a($$2, $$0);
   }

   private boolean a(evo $$0, dsd $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewl b_(dsd $$0, dbf $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evx.a());
   }

   @Override
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcc $$0, dsd $$1, iz $$2, je $$3) {
      dsd $$4 = $$0.a_($$2);
      return $$4.a(awp.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dnb.a);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = this.o();
      enw $$2 = $$0.q().b_($$0.a());
      dcc $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsd $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqf($$0, $$1);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return a($$2, dpk.i, dqs::a);
   }
}
