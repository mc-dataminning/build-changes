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

public class dlp {
   static final String a = "server_data";
   static Codec<dlp> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               je.c.optionalFieldOf("rewarded_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.LONG.optionalFieldOf("state_updating_resumes_at", 0L).forGetter($$0x -> $$0x.f),
               cpq.a.listOf().optionalFieldOf("items_to_eject", List.of()).forGetter($$0x -> $$0x.g),
               Codec.INT.optionalFieldOf("total_ejections_needed", 0).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, dlp::new)
   );
   private static final int d = 128;
   private final Set<UUID> e = new ObjectLinkedOpenHashSet();
   private long f;
   private final List<cpq> g = new ObjectArrayList();
   private long h;
   private int i;
   boolean c;

   dlp(Set<UUID> $$0, long $$1, List<cpq> $$2, int $$3) {
      this.e.addAll($$0);
      this.f = $$1;
      this.g.addAll($$2);
      this.i = $$3;
   }

   dlp() {
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

   boolean a(cia $$0) {
      return this.e.contains($$0.ct());
   }

   @VisibleForTesting
   public void b(cia $$0) {
      this.e.add($$0.ct());
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

   List<cpq> d() {
      return this.g;
   }

   void e() {
      this.i = 0;
      this.i();
   }

   void a(List<cpq> $$0) {
      this.g.clear();
      this.g.addAll($$0);
      this.i = this.g.size();
      this.i();
   }

   cpq f() {
      return this.g.isEmpty() ? cpq.h : Objects.requireNonNullElse(this.g.get(this.g.size() - 1), cpq.h);
   }

   cpq g() {
      if (this.g.isEmpty()) {
         return cpq.h;
      } else {
         this.i();
         return Objects.requireNonNullElse(this.g.remove(this.g.size() - 1), cpq.h);
      }
   }

   void a(dlp $$0) {
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
      return this.i == 1 ? 1.0F : 1.0F - awm.g((float)this.d().size(), 1.0F, (float)this.i);
   }
}
