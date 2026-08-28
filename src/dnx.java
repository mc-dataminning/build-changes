import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnx extends dlx {
   public static final MapCodec<dnx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtn.a.fieldOf("wood_type").forGetter(dlx::d), u()).apply($$0, dnx::new));
   public static final dsu b = dit.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewi> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dex.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dex.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         dex.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         dex.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dtn $$0, drz.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = this.o();
      ent $$2 = $$0.q().b_($$0.a());
      dbz $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enu.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsa $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evp m(dsa $$0) {
      ewi $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
}
