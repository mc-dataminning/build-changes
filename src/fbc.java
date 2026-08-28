import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class fbc extends fbw implements fbq {
   @SerializedName("pingResults")
   public List<fbr> a = Lists.newArrayList();
   @SerializedName("worldIds")
   public List<Long> b = Lists.newArrayList();
}
