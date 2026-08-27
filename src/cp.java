import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cp extends cx<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(apg $$0, cqm $$1, @Nullable box $$2) {
      ekw $$3 = br.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<cc> c, Optional<bc> d) implements cx.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awe.a(br.b, "player").forGetter(cp.a::a), awe.a(cc.a, "item").forGetter(cp.a::b), awe.a(br.b, "entity").forGetter(cp.a::c))
               .apply($$0, cp.a::new)
      );

      public static an<cp.a> a(bc $$0, Optional<cc> $$1, Optional<bc> $$2) {
         return am.R.a(new cp.a(Optional.of($$0), $$1, $$2));
      }

      public static an<cp.a> a(Optional<bc> $$0, Optional<cc> $$1, Optional<bc> $$2) {
         return am.S.a(new cp.a($$0, $$1, $$2));
      }

      public boolean a(apg $$0, cqm $$1, ekw $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(bd $$0) {
         cx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
