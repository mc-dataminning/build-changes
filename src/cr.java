import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cr extends dh<cr.a> {
   @Override
   public Codec<cr.a> a() {
      return cr.a.a;
   }

   public void a(aqu $$0, bsn $$1, List<brv> $$2) {
      List<erp> $$3 = $$2.stream().map($$1x -> bs.b($$0, $$1x)).collect(Collectors.toList());
      erp $$4 = bs.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$4, $$3));
   }

   public static record a(Optional<bd> b, Optional<bd> c, Optional<bd> d) implements dh.a {
      public static final Codec<cr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cr.a::a), axu.a(bs.b, "lightning").forGetter(cr.a::b), axu.a(bs.b, "bystander").forGetter(cr.a::c))
               .apply($$0, cr.a::new)
      );

      public static ao<cr.a> a(Optional<bs> $$0, Optional<bs> $$1) {
         return an.V.a(new cr.a(Optional.empty(), bs.a($$0), bs.a($$1)));
      }

      public boolean a(erp $$0, List<erp> $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || !$$1.stream().noneMatch(this.d.get()::a);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".lightning");
         $$0.a(this.d, ".bystander");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<bd> b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }
   }
}
