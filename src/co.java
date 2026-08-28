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

public class co extends dk<co.a> {
   @Override
   public Codec<co.a> a() {
      return co.a.a;
   }

   public void a(arr $$0, Collection<bwi> $$1, @Nullable czn $$2) {
      List<ezt> $$3 = Lists.newArrayList();
      Set<bwr<?>> $$4 = Sets.newHashSet();

      for (bwi $$5 : $$1) {
         $$4.add($$5.an());
         $$3.add(by.b($$0, $$5));
      }

      this.a($$0, $$3x -> $$3x.a($$3, $$4.size(), $$2));
   }

   public static record a(Optional<bj> b, List<bj> c, cw.d d, Optional<cm> e) implements dk.a {
      public static final Codec<co.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(co.a::a),
                  by.b.listOf().optionalFieldOf("victims", List.of()).forGetter(co.a::b),
                  cw.d.d.optionalFieldOf("unique_entity_types", cw.d.c).forGetter(co.a::c),
                  cm.a.optionalFieldOf("fired_from_weapon").forGetter(co.a::d)
               )
               .apply($$0, co.a::new)
      );

      public static ar<co.a> a(jg<czj> $$0, by.a... $$1) {
         return aq.H.a(new co.a(Optional.empty(), by.a($$1), cw.d.c, Optional.of(cm.a.a().a($$0, czr.xg).b())));
      }

      public static ar<co.a> a(jg<czj> $$0, cw.d $$1) {
         return aq.H.a(new co.a(Optional.empty(), List.of(), $$1, Optional.of(cm.a.a().a($$0, czr.xg).b())));
      }

      public boolean a(Collection<ezt> $$0, int $$1, @Nullable czn $$2) {
         if (!this.e.isPresent() || $$2 != null && this.e.get().a($$2)) {
            if (!this.c.isEmpty()) {
               List<ezt> $$3 = Lists.newArrayList($$0);

               for (bj $$4 : this.c) {
                  boolean $$5 = false;
                  Iterator<ezt> $$6 = $$3.iterator();

                  while ($$6.hasNext()) {
                     ezt $$7 = $$6.next();
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
         dk.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public List<bj> b() {
         return this.c;
      }

      public cw.d c() {
         return this.d;
      }

      public Optional<cm> d() {
         return this.e;
      }
   }
}
