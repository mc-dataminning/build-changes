import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnw extends dlx {
   public static final MapCodec<dnw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtn.a.fieldOf("wood_type").forGetter(dlx::d), u()).apply($$0, dnw::new));
   public static final dsu b = dit.aE;
   public static final ewi c = dex.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewi d = dex.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewi e = ewf.a(c, dex.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewi i = ewf.a(d, dex.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<je, ewi> j = Maps.newEnumMap(ImmutableMap.of(je.c, e, je.d, e, je.f, i, je.e, i));

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dtn $$0, drz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      if ($$2.c_($$3) instanceof dqp $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqu.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsa $$0, cmv $$1, evl $$2, dqp $$3, cun $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof cua && !this.a($$2, $$0);
   }

   private boolean a(evl $$0, dsa $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewi b_(dsa $$0, dbc $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evu.a());
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      switch ((je)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsa $$0, dbz $$1, iz $$2) {
      je $$3 = $$0.c(b).h();
      je $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dbz $$0, dsa $$1, iz $$2, je $$3) {
      dsa $$4 = $$0.a_($$2);
      return $$4.a(awo.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dmy.a);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = this.o();
      ent $$2 = $$0.q().b_($$0.a());
      dbz $$3 = $$0.q();
      iz $$4 = $$0.a();

      for (je $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsa $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqc($$0, $$1);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return a($$2, dph.i, dqp::a);
   }
}
