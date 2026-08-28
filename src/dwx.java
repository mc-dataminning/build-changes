import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dwx(aly<ewm> d, double e, double f, cxk g, Optional<aly<ewm>> h, dwo i, dwo.a j) {
   static final String a = "config";
   static dwx b = new dwx();
   static Codec<dwx> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aly.a(mb.bf).lenientOptionalFieldOf("loot_table", b.b()).forGetter(dwx::b),
                  Codec.DOUBLE.lenientOptionalFieldOf("activation_range", b.c()).forGetter(dwx::c),
                  Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", b.d()).forGetter(dwx::d),
                  cxk.a("key_item").forGetter(dwx::e),
                  aly.a(mb.bf).lenientOptionalFieldOf("override_loot_table_to_display").forGetter(dwx::f)
               )
               .apply($$0, dwx::new)
      )
      .validate(dwx::h);

   private dwx() {
      this(ewd.R, 4.0, 4.5, new cxk(cxo.zt), Optional.empty(), dwo.b, dwo.a.a);
   }

   public dwx(aly<ewm> $$0, double $$1, double $$2, cxk $$3, Optional<aly<ewm>> $$4) {
      this($$0, $$1, $$2, $$3, $$4, b.a(), b.g());
   }

   public dwo a() {
      return this.i;
   }

   private DataResult<dwx> h() {
      return this.e > this.f
         ? DataResult.error(() -> "Activation range must (" + this.e + ") be less or equal to deactivation range (" + this.f + ")")
         : DataResult.success(this);
   }

   public aly<ewm> b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public cxk e() {
      return this.g;
   }

   public Optional<aly<ewm>> f() {
      return this.h;
   }

   public dwo.a g() {
      return this.j;
   }
}
