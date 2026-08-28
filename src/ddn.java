import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ddn(List<ddn.a> c, float d, int e, boolean f) {
   public static final Codec<ddn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddn.a.a.listOf().fieldOf("rules").forGetter(ddn::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(ddn::b),
               azg.l.optionalFieldOf("damage_per_block", 1).forGetter(ddn::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(ddn::d)
            )
            .apply($$0, ddn::new)
   );
   public static final ze<wp, ddn> b = ze.a(ddn.a.b.a(zc.a()), ddn::a, zc.l, ddn::b, zc.h, ddn::c, zc.b, ddn::d, ddn::new);

   public float a(ebq $$0) {
      for (ddn.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(ebq $$0) {
      for (ddn.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<ddn.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public static record a(jk<dno> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<ddn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jv.a(mi.i).fieldOf("blocks").forGetter(ddn.a::a),
                  azg.o.optionalFieldOf("speed").forGetter(ddn.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(ddn.a::c)
               )
               .apply($$0, ddn.a::new)
      );
      public static final ze<wp, ddn.a> b = ze.a(zc.c(mi.i), ddn.a::a, zc.l.a(zc::a), ddn.a::b, zc.b.a(zc::a), ddn.a::c, ddn.a::new);

      public static ddn.a a(jk<dno> $$0, float $$1) {
         return new ddn.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static ddn.a a(jk<dno> $$0) {
         return new ddn.a($$0, Optional.empty(), Optional.of(false));
      }

      public static ddn.a b(jk<dno> $$0, float $$1) {
         return new ddn.a($$0, Optional.of($$1), Optional.empty());
      }

      public jk<dno> a() {
         return this.c;
      }

      public Optional<Float> b() {
         return this.d;
      }

      public Optional<Boolean> c() {
         return this.e;
      }
   }
}
