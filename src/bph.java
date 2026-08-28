import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category({"Minecraft", "Storage"})
@StackTrace(false)
@Enabled(false)
public abstract class bph extends Event {
   @Name("regionPosX")
   @Label("Region X Position")
   public final int regionPosX;
   @Name("regionPosZ")
   @Label("Region Z Position")
   public final int regionPosZ;
   @Name("localPosX")
   @Label("Local X Position")
   public final int localChunkPosX;
   @Name("localPosZ")
   @Label("Local Z Position")
   public final int localChunkPosZ;
   @Name("chunkPosX")
   @Label("Chunk X Position")
   public final int chunkPosX;
   @Name("chunkPosZ")
   @Label("Chunk Z Position")
   public final int chunkPosZ;
   @Name("level")
   @Label("Level Id")
   public final String levelId;
   @Name("dimension")
   @Label("Dimension")
   public final String dimension;
   @Name("type")
   @Label("Type")
   public final String type;
   @Name("compression")
   @Label("Compression")
   public final String compression;
   @Name("bytes")
   @Label("Bytes")
   public final int bytes;

   public bph(eam $$0, dfp $$1, eal $$2, int $$3) {
      this.regionPosX = $$1.h();
      this.regionPosZ = $$1.i();
      this.localChunkPosX = $$1.j();
      this.localChunkPosZ = $$1.k();
      this.chunkPosX = $$1.h;
      this.chunkPosZ = $$1.i;
      this.levelId = $$0.a();
      this.dimension = $$0.b().a().toString();
      this.type = $$0.c();
      this.compression = "standard:" + $$2.b();
      this.bytes = $$3;
   }

   public static class a {
      public static final String a = "regionPosX";
      public static final String b = "regionPosZ";
      public static final String c = "localPosX";
      public static final String d = "localPosZ";
      public static final String e = "chunkPosX";
      public static final String f = "chunkPosZ";
      public static final String g = "level";
      public static final String h = "dimension";
      public static final String i = "type";
      public static final String j = "compression";
      public static final String k = "bytes";

      private a() {
      }
   }
}
