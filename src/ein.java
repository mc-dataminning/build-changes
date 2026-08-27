import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;

public class ein {
   private final int a;
   private final long b;
   private final String c;
   private final eid d;
   private final boolean e;

   private ein(int $$0, long $$1, String $$2, int $$3, String $$4, boolean $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = new eid($$3, $$4);
      this.e = $$5;
   }

   public static ein a(Dynamic<?> $$0) {
      int $$1 = $$0.get("version").asInt(0);
      long $$2 = $$0.get("LastPlayed").asLong(0L);
      OptionalDynamic<?> $$3 = $$0.get("Version");
      return $$3.result().isPresent()
         ? new ein(
            $$1,
            $$2,
            $$3.get("Name").asString(aa.b().c()),
            $$3.get("Id").asInt(aa.b().d().c()),
            $$3.get("Series").asString(eid.a),
            $$3.get("Snapshot").asBoolean(!aa.b().g())
         )
         : new ein($$1, $$2, "", 0, eid.a, false);
   }

   public int a() {
      return this.a;
   }

   public long b() {
      return this.b;
   }

   public String c() {
      return this.c;
   }

   public eid d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }
}
