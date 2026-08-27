import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dlg extends djg {
   public static final MapCodec<dlg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqv.a.fieldOf("wood_type").forGetter(djg::d), u()).apply($$0, dlg::new));
   public static final dqc b = dgc.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ij, etc> i = Maps.newEnumMap(
      ImmutableMap.of(
         ij.c,
         dch.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ij.d,
         dch.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ij.f,
         dch.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ij.e,
         dch.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dlg> a() {
      return a;
   }

   public dlg(dqv $$0, dph.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ij.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n();
      elb $$2 = $$0.q().b_($$0.a());
      czj $$3 = $$0.q();
      id $$4 = $$0.a();
      ij[] $$5 = $$0.f();

      for (ij $$6 : $$5) {
         if ($$6.o().d()) {
            ij $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == elc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpi $$0) {
      return $$0.c(b).p();
   }

   @Override
   public esj m(dpi $$0) {
      etc $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, f);
   }
}
