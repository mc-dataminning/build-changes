import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class dri {
   static final String a = "server_data";
   static Codec<dri> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kc.c.lenientOptionalFieldOf("rewarded_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.LONG.lenientOptionalFieldOf("state_updating_resumes_at", 0L).forGetter($$0x -> $$0x.f),
               cuk.b.listOf().lenientOptionalFieldOf("items_to_eject", List.of()).forGetter($$0x -> $$0x.g),
               Codec.INT.lenientOptionalFieldOf("total_ejections_needed", 0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dri::new)
   );
   private static final int d = 128;
   private final Set<UUID> e = new ObjectLinkedOpenHashSet();
   private long f;
   private final List<cuk> g = new ObjectArrayList();
   private long h;
   private int i;
   boolean c;

   dri(Set<UUID> $$0, long $$1, List<cuk> $$2, int $$3) {
      this.e.addAll($$0);
      this.f = $$1;
      this.g.addAll($$2);
      this.i = $$3;
   }

   dri() {
   }

   void a(long $$0) {
      this.h = $$0;
   }

   long a() {
      return this.h;
   }

   Set<UUID> b() {
      return this.e;
   }

   boolean a(cms $$0) {
      return this.e.contains($$0.cz());
   }

   @VisibleForTesting
   public void b(cms $$0) {
      this.e.add($$0.cz());
      if (this.e.size() > 128) {
         Iterator<UUID> $$1 = this.e.iterator();
         if ($$1.hasNext()) {
            $$1.next();
            $$1.remove();
         }
      }

      this.i();
   }

   long c() {
      return this.f;
   }

   void b(long $$0) {
      this.f = $$0;
      this.i();
   }

   List<cuk> d() {
      return this.g;
   }

   void e() {
      this.i = 0;
      this.i();
   }

   void a(List<cuk> $$0) {
      this.g.clear();
      this.g.addAll($$0);
      this.i = this.g.size();
      this.i();
   }

   cuk f() {
      return this.g.isEmpty() ? cuk.l : Objects.requireNonNullElse(this.g.get(this.g.size() - 1), cuk.l);
   }

   cuk g() {
      if (this.g.isEmpty()) {
         return cuk.l;
      } else {
         this.i();
         return Objects.requireNonNullElse(this.g.remove(this.g.size() - 1), cuk.l);
      }
   }

   void a(dri $$0) {
      this.f = $$0.c();
      this.g.clear();
      this.g.addAll($$0.g);
      this.e.clear();
      this.e.addAll($$0.e);
   }

   private void i() {
      this.c = true;
   }

   public float h() {
      return this.i == 1 ? 1.0F : 1.0F - ayu.g((float)this.d().size(), 1.0F, (float)this.i);
   }
}
