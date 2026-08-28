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

public class db extends dy<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(arq $$0, Collection<bul> $$1, @Nullable cwm $$2) {
      List<eun> $$3 = Lists.newArrayList();
      Set<bus<?>> $$4 = Sets.newHashSet();

      for (bul $$5 : $$1) {
         $$4.add($$5.aq());
         $$3.add(bw.b($$0, $$5));
      }

      this.a($$0, $$3x -> $$3x.a($$3, $$4.size(), $$2));
   }

   public static record a(Optional<bh> b, List<bh> c, dj.d d, Optional<cu> e) implements dy.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(db.a::a),
                  bw.b.listOf().optionalFieldOf("victims", List.of()).forGetter(db.a::b),
                  dj.d.d.optionalFieldOf("unique_entity_types", dj.d.c).forGetter(db.a::c),
                  cu.a.optionalFieldOf("fired_from_weapon").forGetter(db.a::d)
               )
               .apply($$0, db.a::new)
      );

      public static ap<db.a> a(jr<cwi> $$0, bw.a... $$1) {
         return ao.H.a(new db.a(Optional.empty(), bw.a($$1), dj.d.c, Optional.of(cu.a.a().a($$0, cwq.wn).b())));
      }

      public static ap<db.a> a(jr<cwi> $$0, dj.d $$1) {
         return ao.H.a(new db.a(Optional.empty(), List.of(), $$1, Optional.of(cu.a.a().a($$0, cwq.wn).b())));
      }

      public boolean a(Collection<eun> $$0, int $$1, @Nullable cwm $$2) {
         if (!this.e.isPresent() || $$2 != null && this.e.get().a($$2)) {
            if (!this.c.isEmpty()) {
               List<eun> $$3 = Lists.newArrayList($$0);

               for (bh $$4 : this.c) {
                  boolean $$5 = false;
                  Iterator<eun> $$6 = $$3.iterator();

                  while ($$6.hasNext()) {
                     eun $$7 = $$6.next();
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
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.c, ".victims");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public List<bh> b() {
         return this.c;
      }

      public dj.d c() {
         return this.d;
      }

      public Optional<cu> d() {
         return this.e;
      }
   }
}
