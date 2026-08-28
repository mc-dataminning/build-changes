import com.mojang.serialization.MapCodec;

public class ehz<P extends ehy> {
   public static final ehz<eia> a = a("trunk_vine", eia.a);
   public static final ehz<ehx> b = a("leave_vine", ehx.a);
   public static final ehz<ehw> c = a("cocoa", ehw.a);
   public static final ehz<ehv> d = a("beehive", ehv.a);
   public static final ehz<eht> e = a("alter_ground", eht.a);
   public static final ehz<ehu> f = a("attached_to_leaves", ehu.a);
   private final MapCodec<P> g;

   private static <P extends ehy> ehz<P> a(String $$0, MapCodec<P> $$1) {
      return ka.a(lu.X, $$0, new ehz<>($$1));
   }

   private ehz(MapCodec<P> $$0) {
      this.g = $$0;
   }

   public MapCodec<P> a() {
      return this.g;
   }
}
