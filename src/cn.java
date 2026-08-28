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

public class cn extends dj<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(arr $$0, Collection<bwd> $$1, @Nullable cyy $$2) {
      List<eyz> $$3 = Lists.newArrayList();
      Set<bwm<?>> $$4 = Sets.newHashSet();

      for (bwd $$5 : $$1) {
         $$4.add($$5.aq());
         $$3.add(bx.b($$0, $$5));
      }

      this.a($$0, $$3x -> $$3x.a($$3, $$4.size(), $$2));
   }

   public static record a(Optional<bi> b, List<bi> c, cv.d d, Optional<cl> e) implements dj.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(cn.a::a),
                  bx.b.listOf().optionalFieldOf("victims", List.of()).forGetter(cn.a::b),
                  cv.d.d.optionalFieldOf("unique_entity_types", cv.d.c).forGetter(cn.a::c),
                  cl.a.optionalFieldOf("fired_from_weapon").forGetter(cn.a::d)
               )
               .apply($$0, cn.a::new)
      );

      public static aq<cn.a> a(jf<cyu> $$0, bx.a... $$1) {
         return ap.H.a(new cn.a(Optional.empty(), bx.a($$1), cv.d.c, Optional.of(cl.a.a().a($$0, czc.xb).b())));
      }

      public static aq<cn.a> a(jf<cyu> $$0, cv.d $$1) {
         return ap.H.a(new cn.a(Optional.empty(), List.of(), $$1, Optional.of(cl.a.a().a($$0, czc.xb).b())));
      }

      public boolean a(Collection<eyz> $$0, int $$1, @Nullable cyy $$2) {
         if (!this.e.isPresent() || $$2 != null && this.e.get().a($$2)) {
            if (!this.c.isEmpty()) {
               List<eyz> $$3 = Lists.newArrayList($$0);

               for (bi $$4 : this.c) {
                  boolean $$5 = false;
                  Iterator<eyz> $$6 = $$3.iterator();

                  while ($$6.hasNext()) {
                     eyz $$7 = $$6.next();
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
      public void a(bj $$0) {
         dj.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public List<bi> b() {
         return this.c;
      }

      public cv.d c() {
         return this.d;
      }

      public Optional<cl> d() {
         return this.e;
      }
   }
}
