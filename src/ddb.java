import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record ddb(List<ddb.a> c, float d, int e, boolean f) {
   public static final Codec<ddb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ddb.a.a.listOf().fieldOf("rules").forGetter(ddb::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(ddb::b),
               ayw.l.optionalFieldOf("damage_per_block", 1).forGetter(ddb::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(ddb::d)
            )
            .apply($$0, ddb::new)
   );
   public static final yy<wl, ddb> b = yy.a(ddb.a.b.a(yw.a()), ddb::a, yw.l, ddb::b, yw.h, ddb::c, yw.b, ddb::d, ddb::new);

   public float a(ebe $$0) {
      for (ddb.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(ebe $$0) {
      for (ddb.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<ddb.a> a() {
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

   public static record a(jj<dnc> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<ddb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ju.a(mh.i).fieldOf("blocks").forGetter(ddb.a::a),
                  ayw.o.optionalFieldOf("speed").forGetter(ddb.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(ddb.a::c)
               )
               .apply($$0, ddb.a::new)
      );
      public static final yy<wl, ddb.a> b = yy.a(yw.c(mh.i), ddb.a::a, yw.l.a(yw::a), ddb.a::b, yw.b.a(yw::a), ddb.a::c, ddb.a::new);

      public static ddb.a a(jj<dnc> $$0, float $$1) {
         return new ddb.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static ddb.a a(jj<dnc> $$0) {
         return new ddb.a($$0, Optional.empty(), Optional.of(false));
      }

      public static ddb.a b(jj<dnc> $$0, float $$1) {
         return new ddb.a($$0, Optional.of($$1), Optional.empty());
      }

      public jj<dnc> a() {
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
