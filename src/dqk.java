import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqk extends dok {
   public static final MapCodec<dqk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwb.a.fieldOf("wood_type").forGetter(dok::d), u()).apply($$0, dqk::new));
   public static final dvi b = dlf.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jj, ezm> i = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dhj.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jj.d,
         dhj.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jj.f,
         dhj.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jj.e,
         dhj.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dqk> a() {
      return a;
   }

   public dqk(dwb $$0, dun.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jj.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      eqp $$2 = $$0.q().b_($$0.a());
      dej $$3 = $$0.q();
      je $$4 = $$0.a();
      jj[] $$5 = $$0.f();

      for (jj $$6 : $$5) {
         if ($$6.o().d()) {
            jj $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eqq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(duo $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eys o(duo $$0) {
      ezm $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, f);
   }
}
