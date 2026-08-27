import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dfn extends ddo {
   public static final MapCodec<dfn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkt.a.fieldOf("wood_type").forGetter(ddo::d), u()).apply($$0, dfn::new));
   public static final dka b = dak.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ic, eml> i = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwp.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwp.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ic.f,
         cwp.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ic.e,
         cwp.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(dkt $$0, djf.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ic.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = this.o();
      eeq $$2 = $$0.q().b_($$0.a());
      ctr $$3 = $$0.q();
      hx $$4 = $$0.a();
      ic[] $$5 = $$0.f();

      for (ic $$6 : $$5) {
         if ($$6.o().d()) {
            ic $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eer.c));
            }
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(djg $$0) {
      return $$0.c(b).p();
   }

   @Override
   public els h(djg $$0) {
      eml $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, f);
   }
}
