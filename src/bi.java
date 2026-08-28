import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bi extends dv<bi.a> {
   @Override
   public Codec<bi.a> a() {
      return bi.a.a;
   }

   public void a(aqv $$0, ckw $$1, cmk $$2) {
      err $$3 = bv.b($$0, $$1);
      err $$4 = bv.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bg> d) implements dv.a {
      public static final Codec<bi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bi.a::a),
                  bv.b.optionalFieldOf("zombie").forGetter(bi.a::c),
                  bv.b.optionalFieldOf("villager").forGetter(bi.a::d)
               )
               .apply($$0, bi.a::new)
      );

      public static ao<bi.a> b() {
         return an.s.a(new bi.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(err $$0, err $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
