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

public class dc extends dz<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(ard $$0, Collection<buj> $$1, @Nullable cwn $$2) {
      List<evp> $$3 = Lists.newArrayList();
      Set<buq<?>> $$4 = Sets.newHashSet();

      for (buj $$5 : $$1) {
         $$4.add($$5.aq());
         $$3.add(bx.b($$0, $$5));
      }

      this.a($$0, $$3x -> $$3x.a($$3, $$4.size(), $$2));
   }

   public static record a(Optional<bi> b, List<bi> c, dk.d d, Optional<cv> e) implements dz.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(dc.a::a),
                  bx.b.listOf().optionalFieldOf("victims", List.of()).forGetter(dc.a::b),
                  dk.d.d.optionalFieldOf("unique_entity_types", dk.d.c).forGetter(dc.a::c),
                  cv.a.optionalFieldOf("fired_from_weapon").forGetter(dc.a::d)
               )
               .apply($$0, dc.a::new)
      );

      public static aq<dc.a> a(js<cwj> $$0, bx.a... $$1) {
         return ap.H.a(new dc.a(Optional.empty(), bx.a($$1), dk.d.c, Optional.of(cv.a.a().a($$0, cwr.wV).b())));
      }

      public static aq<dc.a> a(js<cwj> $$0, dk.d $$1) {
         return ap.H.a(new dc.a(Optional.empty(), List.of(), $$1, Optional.of(cv.a.a().a($$0, cwr.wV).b())));
      }

      public boolean a(Collection<evp> $$0, int $$1, @Nullable cwn $$2) {
         if (!this.e.isPresent() || $$2 != null && this.e.get().a($$2)) {
            if (!this.c.isEmpty()) {
               List<evp> $$3 = Lists.newArrayList($$0);

               for (bi $$4 : this.c) {
                  boolean $$5 = false;
                  Iterator<evp> $$6 = $$3.iterator();

                  while ($$6.hasNext()) {
                     evp $$7 = $$6.next();
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
         dz.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public List<bi> b() {
         return this.c;
      }

      public dk.d c() {
         return this.d;
      }

      public Optional<cv> d() {
         return this.e;
      }
   }
}
