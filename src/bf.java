import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bf extends dh<bf.a> {
   @Override
   public Codec<bf.a> a() {
      return bf.a.a;
   }

   public void a(aqu $$0, cjx $$1, cll $$2) {
      erp $$3 = bs.b($$0, $$1);
      erp $$4 = bs.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static record a(Optional<bd> b, Optional<bd> c, Optional<bd> d) implements dh.a {
      public static final Codec<bf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bf.a::a), axu.a(bs.b, "zombie").forGetter(bf.a::c), axu.a(bs.b, "villager").forGetter(bf.a::d))
               .apply($$0, bf.a::new)
      );

      public static ao<bf.a> b() {
         return an.s.a(new bf.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public boolean a(erp $$0, erp $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".zombie");
         $$0.a(this.d, ".villager");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
