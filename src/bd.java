import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bd extends cv<bd.a> {
   @Override
   public Codec<bd.a> a() {
      return bd.a.a;
   }

   public void a(ana $$0, cdc $$1, ceo $$2) {
      egp $$3 = bp.b($$0, $$1);
      egp $$4 = bp.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bb> b, Optional<bb> c, Optional<bb> d) implements cv.a {
      public static final Codec<bd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(bd.a::a), atq.a(bp.b, "zombie").forGetter(bd.a::c), atq.a(bp.b, "villager").forGetter(bd.a::d))
               .apply($$0, bd.a::new)
      );

      public static an<bd.a> b() {
         return am.s.a(new bd.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(egp $$0, egp $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
