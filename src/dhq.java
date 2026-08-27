import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dhq extends dfr {
   public static final MapCodec<dhq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmw.a.fieldOf("wood_type").forGetter(dfr::d), u()).apply($$0, dhq::new));
   public static final dmd b = dcn.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ie, eos> i = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cys.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ie.d,
         cys.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ie.f,
         cys.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ie.e,
         cys.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(dmw $$0, dli.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ie.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o();
      egw $$2 = $$0.q().b_($$0.a());
      cvu $$3 = $$0.q();
      hz $$4 = $$0.a();
      ie[] $$5 = $$0.f();

      for (ie $$6 : $$5) {
         if ($$6.o().d()) {
            ie $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == egx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlj $$0) {
      return $$0.c(b).p();
   }

   @Override
   public enz m(dlj $$0) {
      eos $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, f);
   }
}
