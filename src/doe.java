import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class doe extends dmf {
   public static final MapCodec<doe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtu.a.fieldOf("wood_type").forGetter(dmf::d), u()).apply($$0, doe::new));
   public static final dtb b = djb.aE;
   public static final ews c = dff.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ews d = dff.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ews e = ewp.a(c, dff.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ews i = ewp.a(d, dff.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jf, ews> j = Maps.newEnumMap(ImmutableMap.of(jf.c, e, jf.d, e, jf.f, i, jf.e, i));

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dtu $$0, dsg.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      if ($$2.c_($$3) instanceof dqx $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqf.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsh $$0, cmh $$1, evv $$2, dqx $$3, cua $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctn && !this.a($$2, $$0);
   }

   private boolean a(evv $$0, dsh $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewe.a());
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((jf)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsh $$0, dcg $$1, ja $$2) {
      jf $$3 = $$0.c(b).h();
      jf $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dcg $$0, dsh $$1, ja $$2, jf $$3) {
      dsh $$4 = $$0.a_($$2);
      return $$4.a(avu.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dng.a);
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = this.o();
      eob $$2 = $$0.q().b_($$0.a());
      dcg $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsh $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqk($$0, $$1);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return a($$2, dpp.i, dqx::a);
   }
}
