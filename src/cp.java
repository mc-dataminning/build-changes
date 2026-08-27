import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cp extends dd<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(aqf $$0, brd $$1, List<bql> $$2) {
      List<eoa> $$3 = $$2.stream().map($$1x -> br.b($$0, $$1x)).collect(Collectors.toList());
      eoa $$4 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<bc> d) implements dd.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axe.a(br.b, "player").forGetter(cp.a::a), axe.a(br.b, "lightning").forGetter(cp.a::b), axe.a(br.b, "bystander").forGetter(cp.a::c))
               .apply($$0, cp.a::new)
      );

      public static an<cp.a> a(Optional<br> $$0, Optional<br> $$1) {
         return am.V.a(new cp.a(Optional.empty(), br.a($$0), br.a($$1)));
      }

      public boolean a(eoa $$0, List<eoa> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(bd $$0) {
         dd.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<bc> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
