import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cr extends cx<cr.a> {
   @Override
   public Codec<cr.a> a() {
      return cr.a.a;
   }

   public void a(apv $$0, crs $$1, bqa $$2) {
      enk $$3 = br.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bc> b, Optional<cc> c, Optional<bc> d) implements cx.a {
      public static final Codec<cr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(awu.a(br.b, "player").forGetter(cr.a::a), awu.a(cc.a, "item").forGetter(cr.a::b), awu.a(br.b, "entity").forGetter(cr.a::c))
               .apply($$0, cr.a::new)
      );

      public static an<cr.a> a(Optional<bc> $$0, cc.a $$1, Optional<bc> $$2) {
         return am.T.a(new cr.a($$0, Optional.of($$1.b()), $$2));
      }

      public static an<cr.a> a(cc.a $$0, Optional<bc> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(crs $$0, enk $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
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
