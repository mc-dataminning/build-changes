import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class cc extends dv<cc.a> {
   @Override
   public Codec<cc.a> a() {
      return cc.a.a;
   }

   public void a(arh $$0, cvl $$1, coe $$2, Collection<cvl> $$3) {
      est $$4 = bv.b($$0, (btj)($$2.q() != null ? $$2.q() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bg> b, Optional<cs> c, Optional<bg> d, Optional<cs> e) implements dv.a {
      public static final Codec<cc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(cc.a::a),
                  cs.a.optionalFieldOf("rod").forGetter(cc.a::b),
                  bv.b.optionalFieldOf("entity").forGetter(cc.a::c),
                  cs.a.optionalFieldOf("item").forGetter(cc.a::d)
               )
               .apply($$0, cc.a::new)
      );

      public static ao<cc.a> a(Optional<cs> $$0, Optional<bv> $$1, Optional<cs> $$2) {
         return an.E.a(new cc.a(Optional.empty(), $$0, bv.a($$1), $$2));
      }

      public boolean a(cvl $$0, est $$1, Collection<cvl> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               btj $$4 = $$1.c(evp.a);
               if ($$4 instanceof cjz $$5 && this.e.get().a($$5.m())) {
                  $$3 = true;
               }

               for (cvl $$6 : $$2) {
                  if (this.e.get().a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public void a(bh $$0) {
         dv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }

      public Optional<cs> d() {
         return this.e;
      }
   }
}
