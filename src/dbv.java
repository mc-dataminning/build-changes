import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dbv(List<dbv.a> c, float d, int e, boolean f) {
   public static final Codec<dbv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbv.a.a.listOf().fieldOf("rules").forGetter(dbv::a),
               Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dbv::b),
               ays.l.optionalFieldOf("damage_per_block", 1).forGetter(dbv::c),
               Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dbv::d)
            )
            .apply($$0, dbv::new)
   );
   public static final yu<wh, dbv> b = yu.a(dbv.a.b.a(ys.a()), dbv::a, ys.l, dbv::b, ys.h, dbv::c, ys.b, dbv::d, dbv::new);

   public float a(dzo $$0) {
      for (dbv.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(dzo $$0) {
      for (dbv.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dbv.a> a() {
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

   public static record a(ji<dlu> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dbv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jt.a(mg.i).fieldOf("blocks").forGetter(dbv.a::a),
                  ays.o.optionalFieldOf("speed").forGetter(dbv.a::b),
                  Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dbv.a::c)
               )
               .apply($$0, dbv.a::new)
      );
      public static final yu<wh, dbv.a> b = yu.a(ys.c(mg.i), dbv.a::a, ys.l.a(ys::a), dbv.a::b, ys.b.a(ys::a), dbv.a::c, dbv.a::new);

      public static dbv.a a(ji<dlu> $$0, float $$1) {
         return new dbv.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dbv.a a(ji<dlu> $$0) {
         return new dbv.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dbv.a b(ji<dlu> $$0, float $$1) {
         return new dbv.a($$0, Optional.of($$1), Optional.empty());
      }

      public ji<dlu> a() {
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
