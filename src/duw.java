import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duw extends dub {
   public static final MapCodec<duw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(dub::d), t()).apply($$0, duw::new));
   public static final ebt b = ebj.bd;

   @Override
   public MapCodec<duw> a() {
      return a;
   }

   public duw(ech $$0, eas.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Integer.valueOf(ebz.a($$0.i() + 180.0F))).b(d, Boolean.valueOf($$1.a() == exb.c));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eat $$0) {
      return ebz.b($$0.c(b));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, d);
   }
}
