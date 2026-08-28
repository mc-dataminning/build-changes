import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dxe(aly<ewt> d, double e, double f, cxo g, Optional<aly<ewt>> h, dwv i, dwv.a j) {
   static final String a = "config";
   static dxe b = new dxe();
   static Codec<dxe> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aly.a(mb.bg).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dxe::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dxe::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dxe::d),
                  cxo.a("key_item").forGetter(dxe::e),
                  aly.a(mb.bg).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dxe::f)
               )
               .apply($$0, dxe::new)
      )
      .validate(dxe::h);

   private dxe() {
      this(ewk.R, 4.0, 4.5, new cxo(cxs.zt), Optional.empty(), dwv.b, dwv.a.a);
   }

   public dxe(aly<ewt> $$0, double $$1, double $$2, cxo $$3, Optional<aly<ewt>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dwv a() {
      return this.i;
   }

   private DataResult<dxe> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public aly<ewt> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxo e() {
      return this.g;
   }

   public Optional<aly<ewt>> f() {
      return this.h;
   }

   public dwv.a g() {
      return this.j;
   }
}
