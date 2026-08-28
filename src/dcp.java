import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcp(jq<awk> d, brg e, brg f) implements dcj {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               awk.b.fieldOf("sound").forGetter(dcp::b),
               brg.a(1.0E-5F, 10.0F).fieldOf("volume").forGetter(dcp::c),
               brg.a(1.0E-5F, 2.0F).fieldOf("pitch").forGetter(dcp::d)
            )
            .apply($$0, dcp::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      azs $$5 = $$3.ea();
      if (!$$3.bc()) {
         $$0.a(null, $$4.a(), $$4.b(), $$4.c(), this.d, $$3.dn(), this.e.a($$5), this.f.a($$5));
      }
   }

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public jq<awk> b() {
      return this.d;
   }

   public brg c() {
      return this.e;
   }

   public brg d() {
      return this.f;
   }
}
