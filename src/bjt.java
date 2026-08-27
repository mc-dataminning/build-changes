import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class bjt {
   public static final int a = 200;
   public static final int b = 10000;
   private final atp c;
   private final EnumMap<bjv, Map<apt, bjt.b>> d;
   private final Queue<bjt.a> e = new LinkedList<>();

   public bjt(atp $$0) {
      this.c = $$0;
      this.d = new EnumMap<>(bjv.class);

      for (bjv $$1 : bjv.values()) {
         this.d.put($$1, Maps.newHashMap());
      }
   }

   public boolean a(bjv $$0) {
      return !this.d.get($$0).isEmpty();
   }

   public void a(abz $$0) {
      for (apt $$2 : this.d.get($$0.e()).keySet()) {
         $$2.d.b($$0);
      }
   }

   public void a(apt $$0, bjv $$1) {
      if (this.c.f($$0.fY())) {
         this.e.add(new bjt.a($$0, $$1));
      }
   }

   public void a(int $$0) {
      long $$1 = ac.b();
      this.a($$1, $$0);
      this.b($$1, $$0);
   }

   private void a(long $$0, int $$1) {
      for (bjt.a $$2 : this.e) {
         this.d.get($$2.b()).put($$2.a(), new bjt.b($$0, $$1));
      }
   }

   private void b(long $$0, int $$1) {
      for (Map<apt, bjt.b> $$2 : this.d.values()) {
         $$2.entrySet().removeIf($$2x -> {
            boolean $$3 = !this.c.f(((apt)$$2x.getKey()).fY());
            bjt.b $$4 = (bjt.b)$$2x.getValue();
            return $$3 || $$1 > $$4.b() + 200 && $$0 > $$4.a() + 10000L;
         });
      }
   }

   static record a(apt a, bjv b) {
   }

   static record b(long a, int b) {
   }
}
