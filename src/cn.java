import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cn extends cv<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(ane $$0, cmy $$1, @Nullable blv $$2) {
      egw $$3 = bp.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bb> b, Optional<ca> c, Optional<bb> d) implements cv.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(cn.a::a), atw.a(ca.a, "item").forGetter(cn.a::b), atw.a(bp.b, "entity").forGetter(cn.a::c))
               .apply($$0, cn.a::new)
      );

      public static an<cn.a> a(bb $$0, Optional<ca> $$1, Optional<bb> $$2) {
         return am.P.a(new cn.a(Optional.of($$0), $$1, $$2));
      }

      public static an<cn.a> a(Optional<bb> $$0, Optional<ca> $$1, Optional<bb> $$2) {
         return am.Q.a(new cn.a($$0, $$1, $$2));
      }

      public boolean a(ane $$0, cmy $$1, egw $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ca> b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }
   }
}
