import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcr(uk d, Optional<dcr.a> e) {
   public static final String a = "entity";
   public static final Codec<dcr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(uk.a.fieldOf("entity").forGetter($$0x -> $$0x.d), dcr.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, dcr::new)
   );
   public static final Codec<bok<dcr>> c = bok.a(b);

   public dcr() {
      this(new uk(), Optional.empty());
   }

   public dcr(uk d, Optional<dcr.a> e) {
      if (d.e("id")) {
         akt $$2 = akt.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public uk a() {
      return this.d;
   }

   public Optional<dcr.a> b() {
      return this.e;
   }

   public uk c() {
      return this.d;
   }

   public Optional<dcr.a> d() {
      return this.e;
   }

   public static record a(aye<Integer> b, aye<Integer> c) {
      private static final aye<Integer> d = new aye<>(0, 15);
      public static final Codec<dcr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dcr.a::new)
      );

      private static DataResult<aye<Integer>> a(aye<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<aye<Integer>> a(String $$0) {
         return axu.a(aye.a.optionalFieldOf($$0, d), dcr.a::a);
      }

      public boolean a(ir $$0, aqt $$1) {
         return this.b.a($$1.a(dcj.b, $$0)) && this.c.a($$1.a(dcj.a, $$0));
      }

      public aye<Integer> a() {
         return this.b;
      }

      public aye<Integer> b() {
         return this.c;
      }
   }
}
