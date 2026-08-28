import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class cp extends dl<cp.a> {
   @Override
   public Codec<cp.a> a() {
      return cp.a.a;
   }

   public void a(arv $$0, Collection<bwv> $$1, @Nullable daa $$2) {
      List<faj> $$3 = Lists.newArrayList();
      Set<bxe<?>> $$4 = Sets.newHashSet();

      for (bwv $$5 : $$1) {
         $$4.add($$5.an());
         $$3.add(bz.b($$0, $$5));
      }

      this.a($$0, $$3x -> $$3x.a($$3, $$4.size(), $$2));
   }

   public static record a(Optional<bj> b, List<bj> c, cx.d d, Optional<cn> e) implements dl.a {
      public static final Codec<cp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cp.a::a),
                  bz.b.listOf().optionalFieldOf("victims", List.of()).forGetter(cp.a::b),
                  cx.d.d.optionalFieldOf("unique_entity_types", cx.d.c).forGetter(cp.a::c),
                  cn.a.optionalFieldOf("fired_from_weapon").forGetter(cp.a::d)
               )
               .apply($$0, cp.a::new)
      );

      public static ar<cp.a> a(jh<czw> $$0, bz.a... $$1) {
         return aq.H.a(new cp.a(Optional.empty(), bz.a($$1), cx.d.c, Optional.of(cn.a.a().a($$0, dae.xg).b())));
      }

      public static ar<cp.a> a(jh<czw> $$0, cx.d $$1) {
         return aq.H.a(new cp.a(Optional.empty(), List.of(), $$1, Optional.of(cn.a.a().a($$0, dae.xg).b())));
      }

      public boolean a(Collection<faj> $$0, int $$1, @Nullable daa $$2) {
         if (!this.e.isPresent() || $$2 != null && this.e.get().a($$2)) {
            if (!this.c.isEmpty()) {
               List<faj> $$3 = Lists.newArrayList($$0);

               for (bj $$4 : this.c) {
                  boolean $$5 = false;
                  Iterator<faj> $$6 = $$3.iterator();

                  while ($$6.hasNext()) {
                     faj $$7 = $$6.next();
                     if ($$4.a($$7)) {
                        $$6.remove();
                        $$5 = true;
                        break;
                     }
                  }

                  if (!$$5) {
                     return false;
                  }
               }
            }

            return this.d.d($$1);
         } else {
            return false;
         }
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public List<bj> b() {
         return this.c;
      }

      public cx.d c() {
         return this.d;
      }

      public Optional<cn> d() {
         return this.e;
      }
   }
}
