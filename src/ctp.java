import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ctp(sj d, Optional<ctp.a> e) {
   public static final String a = "entity";
   public static final Codec<ctp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(sj.a.fieldOf("entity").forGetter($$0x -> $$0x.d), ctp.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, ctp::new)
   );
   public static final Codec<bhv<ctp>> c = bhv.a(b);

   public ctp() {
      this(new sj(), Optional.empty());
   }

   public ctp(sj d, Optional<ctp.a> e) {
      if (d.e("id")) {
         agt $$2 = agt.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public sj a() {
      return this.d;
   }

   public Optional<ctp.a> b() {
      return this.e;
   }

   public sj c() {
      return this.d;
   }

   public Optional<ctp.a> d() {
      return this.e;
   }

   public static record a(atq<Integer> b, atq<Integer> c) {
      private static final atq<Integer> d = new atq<>(0, 15);
      public static final Codec<ctp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, ctp.a::new)
      );

      private static DataResult<atq<Integer>> a(atq<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<atq<Integer>> a(String $$0) {
         return atg.a(atq.a.optionalFieldOf($$0, d), ctp.a::a);
      }

      public atq<Integer> a() {
         return this.b;
      }

      public atq<Integer> b() {
         return this.c;
      }
   }
}
